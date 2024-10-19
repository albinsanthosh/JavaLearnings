package testPackage;

import javax.json.JsonObject;
import javax.json.Json;

class JsonCreateObjectBuilder {
    public static void main(String[] args) {
        
        JsonObject value = Json.createObjectBuilder()
     .add("firstName", "John").build();
        
        System.out.println(value);
    }
}