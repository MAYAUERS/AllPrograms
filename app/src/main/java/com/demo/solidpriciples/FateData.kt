package com.demo.solidpriciples

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main():Unit = runBlocking {
    var data = getNotes()
        data.map { FormatedNotes(it.title.uppercase(),it.description.lowercase(),it.isActive) }
            .filter { it.isActive }
            .collect{
            println("Collect Notes Data - $it")
        }
}

private fun getNotes(): Flow<Notes> {
    val list = listOf<Notes>(Notes(1,"Meera","All Doing Greate",false),
        Notes(1,"Poonam","All Doing Good",true),
        Notes(1,"Priya","All Doing Awesome",false),
        Notes(1,"Prachi","All Doing Relax",true)
    )
    return list.asFlow()
}

data class Notes(var id:Int,var title:String,var description:String,var isActive:Boolean)
data class FormatedNotes(var title:String,var description:String,var isActive:Boolean)
