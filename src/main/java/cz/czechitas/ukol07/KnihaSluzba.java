package cz.czechitas.ukol07;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KnihaSluzba {
    ObjectMapper objectMapper = new ObjectMapper();

    //není dobře
   try(InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json"));

    {
        if (inputStream == null) {
            throw new RuntimeException("Neni sluzba pro knihy.");
        }

    }
}

