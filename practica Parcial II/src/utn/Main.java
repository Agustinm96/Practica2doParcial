package utn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      /*  String fuente = utn.JSONUtiles.leer("practica");

        try {
           JSONArray jsonArray = new JSONArray(fuente);
            for(int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String id = jsonObject.getString("_id");
                System.out.println(id);

                boolean activo = jsonObject.getBoolean("activo");
                System.out.println(activo);

                String balance = jsonObject.getString("balance");
                System.out.println(balance);

                String imagen = jsonObject.getString("imagen");
                System.out.println(imagen);

                int capacidad = jsonObject.getInt("capacidad");
                System.out.println(capacidad);

                String nombre = jsonObject.getString("nombre");
                System.out.println(nombre);

                String email = jsonObject.getString("email");
                System.out.println(email);

                String phone = jsonObject.getString("phone");
                System.out.println(phone);

                String direccion = jsonObject.getString("direccion");
                System.out.println(direccion);

                String acerca = jsonObject.getString("acerca");
                System.out.println(acerca);

                String fecha_inicio = jsonObject.getString("fecha_inicio");
                System.out.println(fecha_inicio);

                double latitud = jsonObject.getDouble("latitud");
                System.out.println(latitud);

                double longitud = jsonObject.getDouble("longitud");
                System.out.println(longitud);

                JSONArray jsonArray_etiquetas = jsonObject.getJSONArray("etiquetas");
                for(int j=0;j<jsonArray_etiquetas.length();j++){
                    String aux = jsonArray_etiquetas.getString(j);
                    System.out.println(aux);
                }

                JSONArray jsonArray_aviones = jsonObject.getJSONArray("aviones");
                for(int k=0; k<jsonArray_aviones.length();k++){
                    JSONObject jsonObject_aviones = jsonArray_aviones.getJSONObject(k);
                    int id_aviones = jsonObject_aviones.getInt("id");
                    System.out.println(id_aviones);

                    String pilotos = jsonObject_aviones.getString("piloto");
                    System.out.println(pilotos);

                    int capacidad_pasajeros = jsonObject_aviones.getInt("capacidad_pasajeros");
                    System.out.println(capacidad_pasajeros);
                }

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }*/

        Aeropuerto a1 = new Aeropuerto("1", true, "$2.255.377", "Agustin", "Palma 1320");
        Aeropuerto a2 = new Aeropuerto("2", false, "$12.255.321", "Liam", "Jujuy 1925");
        Aeropuerto a3 = new Aeropuerto("3", true, "$152.359.217", "Gisel", "San Juan 655");

        Avion avion1 = new Avion(1, "Agustin Alvarez", 45);
        Avion avion2 = new Avion(2, "Liam Alvarez", 20);
        Avion avion3 = new Avion(15, "Graciela Alvarez", 32);
        Avion avion4 = new Avion(17, "Gisel Leguizamon", 17);
        Avion avion5 = new Avion(38, "Agustin", 75);
        Avion avion6 = new Avion(51, "Pepo de la Vega", 321);


        a1.agregarAviones(avion1);
        a1.agregarAviones(avion2);
        a1.agregarAviones(avion3);

        a2.agregarAviones(avion5);

        a3.agregarAviones(avion4);
        a3.agregarAviones(avion6);

        ArrayList <Aeropuerto> arregloAeropuerto = new ArrayList<>();
        arregloAeropuerto.add(a1);
        arregloAeropuerto.add(a2);
        arregloAeropuerto.add(a3);

        JSONArray jsonArray_aeropuertos = new JSONArray();
        for(int i=0; i<arregloAeropuerto.size();i++){
           JSONObject jsonObject = new JSONObject();
            try {
                jsonObject = arregloAeropuerto.get(i).toJSONObject();
                jsonArray_aeropuertos.put(jsonObject);

                JSONArray jsonArray_aviones = new JSONArray();
                for (int j=0;j<arregloAeropuerto.get(i).getAviones().size();j++){
                    JSONObject jsonObject_avion = new JSONObject();
                    jsonObject_avion = arregloAeropuerto.get(i).getAviones().get(j).toJSONObject();
                    jsonArray_aviones.put(jsonObject_avion);
                }
                jsonArray_aeropuertos.put("aviones: ");
                jsonArray_aeropuertos.put(jsonArray_aviones);

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        System.out.println(jsonArray_aeropuertos);

       // JSONUtilesGraba.grabar(jsonArray_aeropuertos);


    }
}
