package utn;

import org.json.JSONException;
import org.json.JSONObject;

public class Avion {
    private int id;
    private String piloto;
    private int capacidad;

    public Avion(int id, String piloto, int capacidad) {
        this.id = id;
        this.piloto = piloto;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", piloto='" + piloto + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", getId());
            jsonObject.put("piloto", getPiloto());
            jsonObject.put("capacidad", getCapacidad());
        return  jsonObject;
    }
}
