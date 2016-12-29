/**
 * Created by ivanGlez on 12/13/16.
 *
 *
 * https://sparktutorials.github.io/2015/04/03/setting-up-spark-with-gradle.html
 * http://java4fazal.blogspot.mx/2015/08/using-sparkjava-microframework-with.html
 */
import spark.Spark
import spark.Spark.get

fun main(args: Array<String>) {


    get("/hello", { req, res -> "Hello " });
    get("/hello/:name", { req, res -> "Hello " + req.params(":name") });
//    get("/name/:fname/:lname/json", { req, res -> Name(req.params(":fname"), req.params(":lname")) }, { obj -> gson.toJson(obj) });
//
//
//    // lets use function to render json, here 'it' is the implicit parameter as in groovy.
//    val toJson : (Any) -> String = {gson.toJson(it)}
//
//    // some user to render as json.
//    val addr = Address("street 1", "NY", "US");
//    val user = User(Name("Fazal", "Khan"), "faz@gmail.com", addr)
//
//    get("/user/json", { req, res -> user }, toJson);
}
