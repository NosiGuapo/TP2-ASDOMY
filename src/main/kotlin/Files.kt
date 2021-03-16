import java.time.LocalDate
import java.time.LocalTime

class Files (
    private val name: String,
    private val fname: String,
    private val birthdate: String
) {
    private var services: ArrayList<Services> = ArrayList()

    fun addService(aDescription: String, aDate: LocalDate, anHour: LocalTime, anIntervener: ExtInterveners){
        this.services.add(Services(aDescription, aDate, anHour, anIntervener))
    }

    fun getServicesAmmount(): Int {
        return services.count()
    }
    fun getExtServicesAmmount(): Int{
        var counter = 0
        for(aService: Services in services){
            if(aService.getIntervener().javaClass == ExtInterveners::class.java){
                counter += 1
            }
        }
        return counter
    }
    private fun getDate(aService: Services): LocalDate {
        return aService.getDate()
    }

    fun getServicesDays(): Int{
        services.sortBy{
            getDate(it)
        }
        var count = 0
        for(aService: Services in this.services){
            val nextIndex: Int = this.services.indexOf(aService)+1
            if(aService.getDate() != this.services[nextIndex].getDate()){
                count+=1
            }
        }
        return count
    }

    // Appel
    fun display() {
        print("Name: ")
        println(this.name)
        print("First name: ")
        println(this.fname)
        print("Birth date: ")
        println(this.birthdate)
        for(aService: Services in this.services){
            print("Description: ")
            println(aService.getDesc())
            print("Date: ")
            println(aService.getDate())
            print("Hour: ")
            println(aService.getHour())
            print("Intervener name: ")
            println(aService.getIntervener().getName())
            print("Intervener first name: ")
            println(aService.getIntervener().getfName())
            if(aService.getIntervener().javaClass == ExtInterveners::class.java){
                print("External intervener spec: ")
                println(aService.getIntervener().getSpec())
                print("External intervener adress: ")
                println(aService.getIntervener().getAdress())
                print("External intervener telephone number: ")
                println(aService.getIntervener().getTel())
            }
            println("---------------")
        }
    }

    // Getters
    fun getBirthdate(): String{
        return this.birthdate
    }
}