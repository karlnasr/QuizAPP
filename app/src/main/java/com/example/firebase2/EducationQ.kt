package com.example.firebase2

object EducationQ {
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What is the capital of Brazil?",
            "Salvador",
            "Rio de Janeiro",
            "Brasilia",
            "Sao Paulo",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "When did World War I end?",
            "1918",
            "1919",
            "1945",
            "1920",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "2 x 12 + 6 x 13?",
            "720",
            "108",
            "104",
            "102",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the biggest planet in our solar system?",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "The concept of gravity was discovered by which famous physicist?",
            "Albert Einstein",
            "Galileo",
            "Isaac Newton",
            "Max Planck",
            3
        )
        questionsList.add(que5)
        return questionsList
    }
}