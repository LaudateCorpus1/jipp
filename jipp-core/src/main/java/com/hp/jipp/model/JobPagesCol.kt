// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-10-14
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-pages-col" collection as defined in:
 * [XEROX20150505](https://ftp.pwg.org/pub/pwg/ipp/registrations/xerox-counters-20150505.txt).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobPagesCol
constructor(
    var fullColor: Int? = null,
    var monochrome: Int? = null,
) : AttributeCollection {

    /** Construct an empty [JobPagesCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            fullColor?.let { JobPagesCol.fullColor.of(it) },
            monochrome?.let { JobPagesCol.monochrome.of(it) },
        )

    /** Defines types for each member of [JobPagesCol]. */
    companion object : AttributeCollection.Converter<JobPagesCol> {
        override fun convert(attributes: List<Attribute<*>>): JobPagesCol =
            JobPagesCol(
                extractOne(attributes, fullColor),
                extractOne(attributes, monochrome),
            )
        override val cls = JobPagesCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val fullColor = IntType("full-color")
        @JvmField val monochrome = IntType("monochrome")
    }
    override fun toString() = "JobPagesCol(${attributes.joinToString()})"
}
