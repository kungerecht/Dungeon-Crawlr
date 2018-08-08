# Dungeon Crawlr
**Developer:** Kevin Ungerecht<br>
**Start Date:** 8/8/2018<br>
**Type:** Game<br>
**Language:** Java<br>
**Platform:** Mobile/Android<br>
**OS:** Android 6.0 Marshmallow<br>
**SDK:** Android SDK Platform 23<br>
**IDE:** Android Studio 3.1.4<br>
**JDK:** Java SE 10.0.2<br>
**Tools:** Git, Gradle<br>
**SSL:** OpenSSL<br>

<h2>Description</h2>

  Single player two dimensional class-based dungeon crawler role playing game. Players choose a class and can level-up, explore dungeons, loot items, and become stronger while progressing through the game. Players progress though a series of dungeons which are procedurally generated.

<h2>Attributes</h2>

  Players have two **primary** attributes: Health(HP) and Mana(MP) and four **secondary** attributes: Strength(STR), Dexterity(DEX), Intelligence(INT), and Luck(LUK).
  
  <h4>Health</h4>
    Affects how much damage a player can take before they die.
  
  <h4>Mana</h4>
    Affects how many attacks a player can attempt.

  <h4>Strength</h4>
    Affects damage with swords.
    Determines what swords and shields the player can equip.

  <h4>Dexterity</h4>
    Affects damage with bows.
    Determines what bows and quivers the player can equip.

  <h4>Intelligence</h4>
    Affects damage with wands.
    Determines what wands and spell books the player can equip.

  <h4>Luck</h4>
    Affects roll of dice.
    Determines what dice the player can equip.
    Has an effect on content and frequency of item chests, player dodge/block chance, and other events.

<h2>Classes</h2>

  Players can develop four character classes(Fighter, Archer, Wizard, or Gambler).
  Each class has unique moves and items and relies on specific secondary attributes.

  <h4>Fighter</h4>
    Difficulty: Easy<br>
    Melee class that relies on strength and uses swords and shields.
    
  <h4>Archer</h4>
    Difficulty: Medium<br>
    Ranged class that relies on dexterity and uses bows.
    
  <h4>Wizard</h4>
    Difficulty: Medium<br>
    Magic class that relies on intelligence and uses wands and spell books.

  <h4>Gambler</h4>
    Difficulty: Hard<br>
    Special class that relies on luck and uses dice.

<h2>Items</h2>

  Players can equip different items pertaining to a certain class which affect the player's attacks and defences. Players can have one offensive and one defensive item equipped at a time. Items have class and player level requirements.
  
  <h4>Swords</h4>
    Used by Fighter class. Has strength requirement.
    
  <h4>Shields</h4>
    Used by Fighter class. Has strength requirement.
    
  <h4>Bows</h4>
    Used by Archer class. Has dexterity requirement.
    
  <h4>Quivers</h4>
    Used by Archer class. Has dexterity requirement.
    
  <h4>Wands</h4>
    Used by Wizard class. Has intelligence requirement.
    
  <h4>Books</h4>
    Used by Wizard class. Has intelligence requirement.
    
  <h4>Dice</h4>
    Used by Gambler class. Has luck requirement. Can be offensive or defensive.