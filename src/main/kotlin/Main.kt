fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val compressedString = compressString(input)

    println("Сжатая строка: $compressedString")
}

fun compressString(input: String): String {
    if (input.isEmpty()) {
        return ""
    }

    val compressedStringBuilder = StringBuilder()
    var currentChar = input[0]
    var charCount = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            charCount++
        } else {
            compressedStringBuilder.append(currentChar)
            if (charCount > 1) {
                compressedStringBuilder.append(charCount)
            }
            currentChar = input[i]
            charCount = 1
        }
    }

    compressedStringBuilder.append(currentChar)
    if (charCount > 1) {
        compressedStringBuilder.append(charCount)
    }

    return compressedStringBuilder.toString()
}