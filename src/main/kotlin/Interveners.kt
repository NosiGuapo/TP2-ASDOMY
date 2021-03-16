open class Interveners ( // open class pour l'héritage
    private val name: String,
    private val fname: String
): Any() {
    private var services: ArrayList<Services> = ArrayList()

    fun addService(aService: Services){
        this.services.add(aService)
    }

    // Getters
    fun getName(): String{
        return this.name
    }
    fun getfName(): String{
        return this.fname
    }
}