//import com.fasterxml.jackson.databind.MappingIterator
//import com.fasterxml.jackson.databind.ObjectMapper
//import com.fasterxml.jackson.dataformat.csv.CsvMapper
//import com.fasterxml.jackson.dataformat.csv.CsvSchema
//
//import java.io.File
//import java.io.IOException
//
//
//
//    fun main() {
//        var j = 0
//        val input = File("test.csv")
//        val output = File("data.json")
//        val data = readObjectsFromCsv(input)
//        writeAsJson(data, output)
//    }
//    fun readObjectsFromCsv(file: File?): List<Map<*, *>> {
//        val bootstrap: CsvSchema = CsvSchema.emptySchema().withHeader()
//        val csvMapper = CsvMapper()
//        val mappingIterator: MappingIterator<Map<*, *>> = csvMapper.reader().with(bootstrap).readValues(file)
////            .with(bootstrap).readValues(file)
//        return mappingIterator.readAll()
//    }
//    fun writeAsJson(data: List<Map<*, *>>?, file: File?) {
//        val mapper = ObjectMapper()
//        mapper.writeValue(file, data)
//    }
