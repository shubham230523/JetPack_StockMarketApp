package com.plcoding.stockmarketapp.data.local

import androidx.room.*

@Dao
interface StockDao {
    @Query(
        """
            SELECT *
            FROM companylistingentity
            WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR
             UPPER(:query) == symbol
        """
    )
    suspend fun searchCompanyListing(query: String) : List<CompanyListingEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )

    @Query("DELETE FROM companylistingentity")
    suspend fun clearCompanyListings()
}