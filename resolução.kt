fun main() {
    var name = "TaskMan"
    var xp = 19000
    var nivel = listOf(Bro
    
    when(xp){
      in -999999999999999999..-1 -> println("Olá $name, cuidado! \nvocê está seguindo o caminho Dark!")
      in 0..1000 -> println("Olá $name, seu nível é Ferro!")
      in 1001..2000-> println("Olá $name, seu nível é Bronze!")
      in 2001..5000-> println("Olá $name, seu nível é Prata!")
      in 5001..7000-> println("Olá $name, seu nível é Ouro!")
      in 7001..8000-> println("Olá $name, seu nível é Platina!")
      in 8001..9000-> println("Olá $name, seu nível é Ascendente!")
      in 9001..10000 -> println("Olá $name, seu nível é Imortal!")
      
      else -> println("Olá $name, seu nível é Radiante!")
}
}
