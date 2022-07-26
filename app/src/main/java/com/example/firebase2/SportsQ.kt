package com.example.firebase2

object SportsQ {
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "Who won the 2021 Ballon D'Or?",
            "Lionel Messi",
            "Rabih Ataya",
            "Cristiano Ronaldo",
            "Robert Lewandowski",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "In which stadium does Arsenal play?",
            "Old Trafford",
            "Wembley Stadium",
            "Arsenal Arena",
            "Emirates Stadium",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Who won the NBA 2012 Championship?",
            "Sagesse",
            "Oklahoma Thunder",
            "Boston Celtics",
            "Miami Heat",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Where does Wimbledon take place?",
            "USA",
            "England",
            "France",
            "Spain",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Who won the F1 Driver's Championship in 2021?",
            "Max Verstappen",
            "Lewis Hamilton",
            "Pierre Gasly",
            "Fernando Alonso",
            1
        )
        questionsList.add(que5)
        return questionsList
    }
}