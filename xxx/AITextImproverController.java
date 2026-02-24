package com.squareup.okhttp;

import okhttp3.*;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Allow frontend to call this API
public class AITextImproverController {

    private final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(2, TimeUnit.MINUTES)
            .readTimeout(5, TimeUnit.MINUTES)
            .writeTimeout(2, TimeUnit.MINUTES)
            .build();

    /**
     * POST /api/improve
     * Body: { "mode": 1|2|3, "text": "your text here" }
     * Response: { "original": "...", "improved": "..." }
     */
    @PostMapping("/improve")
    public ResponseEntity<?> improve(@RequestBody Map<String, Object> body) {
        int mode = (int) body.get("mode");
        String userText = (String) body.get("text");

        if (userText == null || userText.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("error", "Text cannot be empty"));
        }

        String prompt;
        switch (mode) {
            case 1:  prompt = "Fix grammar of this text: " + userText; break;
            case 2:  prompt = "Rewrite this text in professional tone: " + userText; break;
            case 3:  prompt = "Summarize this text shortly: " + userText; break;
            default: prompt = null;
        }

        if (prompt == null) {
            return ResponseEntity.badRequest().body(Map.of("error", "Invalid mode. Use 1, 2, or 3."));
        }

        try {
            String improved = callOllama(prompt);
            return ResponseEntity.ok(Map.of(
                "original", userText,
                "improved", improved
            ));
        } catch (IOException e) {
            return ResponseEntity.internalServerError()
                .body(Map.of("error", "Failed to reach Ollama: " + e.getMessage()));
        }
    }

    // ✅ Your original callOllama logic — untouched
    public String callOllama(String prompt) throws IOException {
        MediaType mediaType = MediaType.parse("application/json");

        JSONObject json = new JSONObject();
        json.put("model", "llama3");
        json.put("prompt", prompt);
        json.put("stream", false);

        RequestBody requestBody = RequestBody.create(json.toString(), mediaType);

        Request request = new Request.Builder()
                .url("http://localhost:11434/api/generate")
                .post(requestBody)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        JSONObject resultJson = new JSONObject(response.body().string());
        return resultJson.getString("response").trim();
    }
}
