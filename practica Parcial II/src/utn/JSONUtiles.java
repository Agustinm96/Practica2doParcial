package utn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;

public class JSONUtiles {
        public static String leer(String archivo)
        {
            String contenido = "";
            try
            {
                contenido = new String(Files.readAllBytes(Paths.get(archivo+".json")));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return contenido;
        }
}

