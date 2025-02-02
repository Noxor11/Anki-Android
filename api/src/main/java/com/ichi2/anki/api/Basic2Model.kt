//noinspection MissingCopyrightHeader #8659
package com.ichi2.anki.api

/**
 * Definitions of the basic with reverse model
 */
object Basic2Model {
    @JvmField // required for Java API
    val FIELDS = arrayOf("Front", "Back")
    // List of card names that will be used in AnkiDroid (one for each direction of learning)
    @JvmField // required for Java API
    val CARD_NAMES = arrayOf("Card 1", "Card 2")
    // Template for the question of each card
    @JvmField // required for Java API
    val QFMT = arrayOf("{{Front}}", "{{Back}}")
    @JvmField // required for Java API
    val AFMT = arrayOf(
        "{{FrontSide}}\n\n<hr id=\"answer\">\n\n{{Back}}",
        "{{FrontSide}}\n\n<hr id=\"answer\">\n\n{{Front}}"
    )
}
