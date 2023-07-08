package com.knoldus.restAPI.model

/**
 *     Web Layer      (controller,REST mapping)
 *          |
 *     Service Layer   (Services, build business logic)
 *          |
 *     Data Source      (Data retrieval, storage)
 *          |
 *     Data Layer      (Models, serialization)
 */


/**
 * Represents a bank with account details.
 */
data class Bank(

    /**
     *  The account number of the bank
     */
    var accountNum: String,

    /**
     *  The trust value associated with the bank
     */
    val trust: Double,

    /**
     * The transaction fee charged by the bank
     */
    val transactionFee: Int
    )
