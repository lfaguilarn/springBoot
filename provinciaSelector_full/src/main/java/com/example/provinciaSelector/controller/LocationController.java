package com.example.provinciaSelector.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.Iterator;
import java.util.Map;

@RestController
public class LocationController {
    private static final String JSON_URL = "https://gist.githubusercontent.com/emamut/6626d3dff58598b624a1/raw/166183f4520c4603987c55498df8d2983703c316/provincias.json";

    @GetMapping("/provincias")
    public JsonNode getProvincias() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new URL(JSON_URL));
        return root;
    }

    @GetMapping("/cantones")
    public JsonNode getCantones(@RequestParam String provinciaId) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new URL(JSON_URL));
        return root.path(provinciaId).path("cantones");
    }

    @GetMapping("/parroquias")
    public JsonNode getParroquias(@RequestParam String provinciaId, @RequestParam String cantonId) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new URL(JSON_URL));
        return root.path(provinciaId).path("cantones").path(cantonId).path("parroquias");
    }
}
