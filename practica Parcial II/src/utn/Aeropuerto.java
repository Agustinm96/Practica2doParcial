package utn;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Aeropuerto {
    private String id;
    private boolean activo;
    private String balance;
    private String nombre;
    private String direccion;
    private ArrayList <Avion> aviones;

    public Aeropuerto(String id, boolean activo, String balance, String nombre, String direccion) {
        this.id = id;
        this.activo = activo;
        this.balance = balance;
        this.nombre = nombre;
        this.direccion = direccion;
        aviones = new ArrayList<>();
    }

    public Aeropuerto() {
        id = "";
        activo = false;
        balance ="";
        nombre= "";
        direccion= "";
        aviones = new ArrayList<>();
    }

    public void agregarAviones(Avion e) {
        aviones.add(e);
    }

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "id='" + id + '\'' +
                ", activo=" + activo +
                ", balance='" + balance + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public JSONObject toJSONObject () throws JSONException {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("_id", getId());
        jsonObject.put("activo", isActivo());
        jsonObject.put("balance", getBalance());
        jsonObject.put("nombre", getNombre());
        jsonObject.put("direccion", getDireccion());

        return jsonObject;
    }




}
