// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-10-14
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "save-disposition" keywords.
 *
 * Also used by: "save-disposition-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf">PWG5100.11</a>
 */
public class SaveDisposition {
    public static final String none = "none";
    public static final String printSave = "print-save";
    public static final String saveOnly = "save-only";
}