package com.example.testttapplication.sharedpreff.presentation

import com.example.testttapplication.sharedpreff.domain.UseCases


class CustomSharedPref(
    private val useCase: UseCases
) {

    /*
    * @key - takes key as param
    * returns value as int
    * get entry from custom shared pref
    * */
    suspend fun getInt(key: String) =  useCase.getInt(key)

    /*
    * @key - takes key as param
    * returns value as String
    *     *  * * get entry from custom shared pref

    * */
    suspend fun getString(key: String) =  useCase.getString(key)

    /*
    * @key - takes key as param
    * returns value as double
    *  * * get entry from custom shared pref

    * */
    suspend fun getDouble(key: String) =  useCase.getDouble(key)


    /*
   * @key - takes key as param
   * @value - takes value as param
   *  * * put entry from custom shared pref

   * */
    suspend fun putInt(key: String, value: Int) = useCase.putInt(key, value)

    /*
     * @key - takes key as param
     * @value - takes value as param
     *  * * put entry from custom shared pref
     * */
    suspend fun putString(key: String, value: String) = useCase.putString(key, value)

    /*
     * @key - takes key as param
     * @value - takes value as param
     * put entry from custom shared pref

     * */
    suspend fun putDouble(key: String, value: Double) =  useCase.putDouble(key, value)


    /*
    * @key - takes key as param
    * remove entry from custom shared pref
    * */
    suspend fun remove(key: String) = useCase.remove(key)
}