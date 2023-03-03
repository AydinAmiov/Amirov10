class Formula(private var Volume_Vin: Int) : Computer() {
    override fun base(): Double {
        return ((0.1 * base) + volume) + 0.5 * Volume_Vin
    }

    override fun Info() {
        TODO("Not yet implemented")
    }

    override fun info() {
        println("Название процессора: $name Тактовая частота: $base Объем оперативной памяти: $volume")
    }

    fun Get_Volume_Vin(): Int {
        return Volume_Vin
    }

    fun Set_Volume_Vin(Volume_Vin: Int) {
        this.Volume_Vin = Volume_Vin
    }
}