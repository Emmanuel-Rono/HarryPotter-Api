package com.emmanuel_rono.harry_potter_api


//The repository is used to act as an interface of the datasource and the Presentation layer
class dataRepository
{
    suspend fun getcharacters():List<CharactersItem>
    {
    //The repository is used to
    return try
    {
        ApiClient.chaApiService.getCharcters()
    }
    catch (e:Exception)
    {
        //handle Network Error
        emptyList()
    }

}}