import java.time.LocalDate
import java.time.LocalTime

fun main() {
    val intervener1 = Interveners("Alexis", "Dupont")
    val intervener2 = ExtInterveners("Daniel", "Illyn", "Surgean", "adr", "0627544426")
    val intervener3 = Interveners("Adrien", "Martins")
    val intervener5 = ExtInterveners("Yoan", "Carter", "Anaesthesist", "adr", "0155889966")

    val file1: Files = Files("aaa", "bbb", "1995-11-22")
    val file2: Files = Files("ccc", "zzz", "1980-01-22")

    file2.addService("appendicitis", LocalDate.parse("2021-01-20"), LocalTime.parse("12:00"), intervener5)
    file2.addService("Lazer surgery", LocalDate.parse("2020-12-20"), LocalTime.parse("15:30"), intervener2)

    file2.display()
}