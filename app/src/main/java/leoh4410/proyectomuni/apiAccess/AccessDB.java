package leoh4410.proyectomuni.apiAccess;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import leoh4410.proyectomuni.dto.UsuarioDTO;

/**
 * Created by USUARIO on 18/11/2016.
 */
public class AccessDB {
    static String host = "http://clienteservidor.sytes.net/api/v1/";
    static String registrarApi = "usuarios/registrar";
    /*
    static String URL_GetReclamos = URL_Server + "/api/____";
    */

    static String tag_json_arry = "jarray_req";

    public static void changeURLServer(String url) {
        host = url;
    }

    public static String getURLServer() {
        return host;
    }


    public static void registrarUsuarioEnServer(UsuarioDTO usuario, final Activity activity) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(usuario);
        try {
            //final ProgressDialog progressDialog= ProgressDialog.show(Formulario.this, "", "Registrando usuario...", true);
            JsonObjectRequest jsObjRequest = new JsonObjectRequest
                    (Request.Method.POST, String.format("%s%s", host, registrarApi), new JSONObject(jsonString), new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            //progressDialog.dismiss();
                            Toast.makeText(activity.getApplicationContext(), "Usuario registrado correctamente", Toast.LENGTH_LONG).show();
                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
                            //progressDialog.dismiss();
                            Toast.makeText(activity.getApplicationContext(), "Error de comunicacion", Toast.LENGTH_LONG).show();
                        }
                    });
            //Agregar token
            RequestSingleton.getInstance(activity.getApplicationContext()).addToRequestQueue(jsObjRequest, "5dcf750d9375ca2111fb585b9f3a372e");
        } catch (JSONException e) {
            Toast.makeText(activity.getApplicationContext(), "Ocurrion un error al preparar el request", Toast.LENGTH_LONG).show();
        }
    }


    /*
    // Download available itineraries, using Volley
    public static void availableItineraries (Activity act) {

        final ItineraryDTO itinerary = new ItineraryDTO();
        final Activity activity = act;

        JsonArrayRequest req = new JsonArrayRequest(URL_GetAvailableItineraries,
                new Response.Listener<JSONArray>(){
                    @Override
                    public  void onResponse(JSONArray response) {
                        try {
                            if (response.length() > 0) {
                                for (int i = 0; i < response.length(); i++) {
                                    JSONObject jsonObject = response.getJSONObject(i);
                                    saveJsonItinerary (jsonObject);
                                }
                            }
                        }
                        catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("TAG", "Error: " + error.getMessage());
            }
        });
        //Adding request to request queue
        VolleyManager.getInstance(act.getApplicationContext()).addToRequestQueue(req, tag_json_arry);
    }

    // Create a Model itinerary from data of a JSon object itinerary, and save it
    public static void saveJsonItinerary (JSONObject jsonObject) {
        ItineraryDTO itinerary = new ItineraryDTO();
        try {
            itinerary.setIdItinerary(jsonObject.getInt("idItinerary"));
            itinerary.setState(jsonObject.getInt("state"));
            itinerary.setEstimatedDistance(jsonObject.getInt("estimatedDistance"));
            itinerary.setEstimatedTime(UtilsDateTime.stringToTime(jsonObject.getString("estimatedTime").substring(11, 19)));
            itinerary.setScheduledDate(UtilsDateTime.stringToDate(jsonObject.getString("scheduledDate").substring(0,10)));
            itinerary.setCreationDate(UtilsDateTime.stringToDate(jsonObject.getString("creationDate").substring(0,10)));
            itinerary.setStart(null);
            itinerary.setFinish(null);
            if (! (jsonObject.getString("visits").equals("null")))
            {
                itinerary.setVisits(readJsonVisits(jsonObject.getJSONArray("visits")));
            }
            ItineraryService.saveItinerary(itinerary);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    // Create a visit list from a JSon array
    public static List<VisitDTO> readJsonVisits (JSONArray jsonArray) {
        List<VisitDTO> visits = new ArrayList<VisitDTO>();
        VisitDTO visit = new VisitDTO();

        try {
            if (jsonArray.length() > 0) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);

                    visit.setIdVisit(jsonObject.getInt("idVisit"));
                    visit.setReasonNotRealization(jsonObject.getInt("reasonNotRealization"));
                    visit.setVisitState(jsonObject.getInt("state"));
                    visit.setLatitude(jsonObject.getDouble("latitude"));
                    visit.setLongitude(jsonObject.getDouble("longitude"));
                    visit.setComments("");
                    visit.setAddress(jsonObject.getString("address"));
                    visit.setSubject(jsonObject.getString("subject"));
                    visit.setEstimatedTime(UtilsDateTime.stringToTime(jsonObject.getString("estimatedTime").substring(11,19)));
                    visit.setStart(null);
                    visit.setFinish(null);

                    JSONObject jsonCustomer = jsonObject.getJSONObject("customer");
                    CustomerDTO customer = new CustomerDTO();
                    customer.setFirstName(jsonCustomer.getString("firstName"));
                    customer.setLastName(jsonCustomer.getString("lastName"));
                    customer.setOrganization(jsonCustomer.getString("organization"));

                    visit.setCustomer(customer);

                    visits.add(visit);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return visits;
    }



*/


}
