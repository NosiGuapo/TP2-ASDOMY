class ExtInterveners (
    private val extname: String, // Le nom de variable doit être différent du nom de variable dans intervenant
    private val extfname: String,
    private val specialisation: String,
    private val adress: String,
    private val tel: String
): Interveners(extname, extfname) { // Variables de cette classe

    // Getters
    fun getSpec(): String{
        return this.specialisation
    }
    fun getAdress(): String{
        return this.adress
    }
    fun getTel(): String{
        return this.tel
    }
}