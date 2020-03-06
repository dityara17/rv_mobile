package com.dityara.kotlinstarter

object ClubData {

    private val teamName = arrayOf(
        "Real Madrid",
        "Juventus",
        "Ac Milan",
        "Manchaster United",
        "Chelsea",
        "Liverpool",
        "PSG"
    )

    private val teamDescription = arrayOf(
        "Real Madrid adalah team",
        "Juventus adalah team",
        "Ac Milan adalah team",
        "Manchaster United adalah team",
        "Chelsea adalah team",
        "Liverpool adalah team",
        "PSG adalah team"
    )

    private val teamPhoto = arrayOf(
        "https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/130px-Real_Madrid_CF.svg.png",
        "https://icon2.cleanpng.com/20180629/yho/kisspng-juventus-f-c-serie-a-uefa-champions-league-footba-juventus-logo-5b35f0f88d7826.9727821615302617525795.jpg",
        "https://cdn.imgbin.com/1/1/12/imgbin-a-c-milan-inter-milan-serie-a-football-football-0QCG2tMij2BYhnkqyLHEFE11N.jpg",
        "https://pngimg.com/uploads/manchester_united/manchester_united_PNG21.png",
        "https://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4e1.png",
        "https://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4e5.png",
        "https://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4d8.png"
    )

    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in teamName.indices) {
                val club = Club()
                club.name = teamName[position]
                club.detail = teamDescription[position]
                club.photo = teamPhoto[position]
                list.add(club)
            }
            return list
        }


}