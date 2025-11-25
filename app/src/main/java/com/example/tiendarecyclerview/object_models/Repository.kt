package com.example.tiendarecyclerview.object_models

import com.example.tiendarecyclerview.controler.Controller
import com.example.tiendarecyclerview.models.Coche

object Repository {
    var listCoches : List<Coche> = listOf(
        Coche(
            "Toyota Corolla","Toyota",20000,"https://preview.redd.it/pqn4vadakzc71.jpg?width=4272&format=pjpg&auto=webp&s=8a1820b25977c21bebfa0c146d19da8a63462ea8"
        ),
        Coche(
            "Honda Civic","Honda",23000,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSig2IOCdXaeJcgWHRJtuSdPPYQUDw_JxhdHg&s"
        ),
        Coche(
            "Ford Focus","Ford",21000,"https://www.auto-data.net/images/f109/Ford-Focus-Sedan-USA.jpg"
        ),
        Coche(
            "Renault laguna","Renault",15000,"https://www.automoli.com/common/vehicles/_assets/img/gallery/f96/renault-laguna-ii.jpg"
        ),
        Coche(
            "Mazda 3","Mazda",18000,"https://i.ytimg.com/vi/nbp2AETsH9I/sddefault.jpg"
        ),
        Coche(
            "Renault Twingo","Renault ",50000,"https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fup.autotitre.com%2F6fc62e23f6.jpg&f=1&nofb=1&ipt=2fc3471a91488be44dfb298c2fcbaf02c6be51f53145d9212aed5f6030807278"
        )
    )

}