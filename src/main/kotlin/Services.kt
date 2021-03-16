import java.time.LocalDate
import java.time.LocalTime

class Services (
    private val desc: String,
    private val date: LocalDate,
    private val hour: LocalTime,
    private val anIntervener: ExtInterveners
) {
    /*init {
        this.anIntervener.addService(this)
    }*/

    fun compareServices(aService: Services): Int{
       if(this.date.isEqual(aService.date)){
           return 0
       }
        else if(this.date.isAfter(aService.date)){
            return 1
       }
        else{
            return -1
       }
    }

    // Getters
    fun getDesc(): String{
        return this.desc
    }
    fun getDate(): LocalDate{
        return this.date
    }
    fun getHour(): LocalTime{
        return this.hour
    }
    fun getIntervener(): ExtInterveners{
        return this.anIntervener
    }
}