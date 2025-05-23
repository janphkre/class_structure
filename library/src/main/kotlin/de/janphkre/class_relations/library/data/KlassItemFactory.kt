package de.janphkre.class_relations.library.data

import de.janphkre.class_relations.library.model.KlassItem

interface KlassItemFactory {

    fun createItem(
        name: String,
        packageList: List<String>
    ): KlassItem

    fun createItem(
        name: String,
        packageString: String
    ): KlassItem

    fun getItemsForPackage(packageString: String): Collection<KlassItem>

    fun getAllPackages(): Collection<String>

    companion object {

        private val klassItemFactory = KlassItemFactoryImpl()

        fun getInstance(): KlassItemFactory {
            return klassItemFactory
        }
    }
}
