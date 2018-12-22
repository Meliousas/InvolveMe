package me.involve.involveme

enum class Tag {
    nature {
        fun getLogo(): Int {return R.drawable.flowers}},
    sport{
        fun getLogo(): Int {return R.drawable.bicycle}},
    entertainment{
        fun getLogo(): Int {return R.drawable.karaoke}},
    cleaning{
        fun getLogo(): Int {return R.drawable.garbage}},
    architecture{
        fun getLogo(): Int {return R.drawable.measuring}},
    other {
        fun getLogo(): Int {return R.drawable.question}},

}