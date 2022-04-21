import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.nio.file.Files

class Main {
    fun start() {
        val resource = this.javaClass.classLoader.getResource("20190403.txt")!!
        val file = File(resource.path)
        val txtContent = String(Files.readAllBytes(file.toPath()))
        val list = txtContent.split("\r\n\r\n")
        val objList = mutableListOf<Content>()
        list.forEach {
            objList.add(Content(file.nameWithoutExtension, "", it))
        }
        val data = Data(objList)
        val s = Json.encodeToString(data)
        print(s)
    }
}

fun main() {
    Main().start()
}
