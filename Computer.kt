abstract class Computer : Info {
    var name: String = ""
    var base: Double = 0.0
    var volume: Int = 0
    open fun base(): Double {
        return (0.1 * base) + volume
    }

    open fun info() {
        print("Название процессора: $name Тактовая частота: $base Объем оперативной памяти: $volume")
    }

}