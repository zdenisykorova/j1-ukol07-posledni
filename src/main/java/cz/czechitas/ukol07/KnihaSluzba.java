package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KnihaSluzba {
    private List<Kniha> kniha;

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            if (inputStream == null) {
                throw new FileNotFoundException("Soubor chybi.");
            }
            objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {
            });
        }

        //Path kniha = Paths.get("kniha.json");
        //try(InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {if (inputStream == null) {
        //      //      throw new IOException("Neni sluzba pro knihy.");
        //        //}}
        //ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});


    }
}

