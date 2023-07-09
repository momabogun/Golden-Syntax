class Dragon(
    name: String,
    health : Int,
    attackPower: Int
):Enemy(name,health,attackPower) {
    override fun toString(): String {
        return this.name
    }
    fun fireBreath(target: Heroes){
        println("${this.name} casted Fire Breath!!")
        val fireBreath = attackPower * (1..2).random()
        target.takeDamage(fireBreath)
    }
    fun fireStrength(){
        attackPower += 400
        println("${this.name} casted Fire Strength!!")
        println("His attack power is now ${this.attackPower}")
    }
    fun fireFromWithin(target: MutableList<Heroes>){
        val fireFrom = attackPower/3
        for (hero in target){
            hero.takeDamage(fireFrom)
        }

    }
    fun cataclysm(target: Heroes){
        val cataclysm = attackPower*200
        target.takeDamage(cataclysm)
    }

}