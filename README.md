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

  Single player two dimensional class-based dungeon crawler role playing game. Players choose a class and can level-up, explore dungeons, loot items, and become stronger while progressing through the game. Players progress though a series of dungeons which have RNG chance selected rooms.

<h2>Dungeons</h2>

  Linear collections of room instances in which the player progresses through. Dungeons also have a theme and monster level.
  
  <h4>Themes</h4>
    Each dungeon has a theme which changes as the player progresses through the game.<br>
    Themes correspond with player&monsters level and determine what npcs, types of monsters, and events the player encounters.<br>
    Each theme has a boss encounter in the room before the end of the dungeon theme.
    Progression starts at the lowest point in the map - and goes as follows:<br>
    Underworld -> Underground -> Sewers -> City -> Rooftops -> Sky -> Space<br>
    
   <h6>Underworld</h6>
    Hell like place where the player begins. Dungeons contain evil creatures.
   <h6>Underground</h6>
    Deep underground dungeons. Dungeons contain mole people. Boss is leader of mole people.
   <h6>Sewers</h6>
    Waterways and tunnels under the City. Dungeons contain reptilian creatures. Boss is ?????.
   <h6>City</h6>
    Metropolitan area on the surface. Dungeons contain humans(or zombies?). Boss is ??????.
   <h6>Rooftops</h6>
    Tops of the City buildings. Dungeons contain bussinessmen. Boss is CEO.
   <h6>Sky</h6>
    Heaven like place. Dungeons contain angels. Boss is demigod/archangel.
   <h6>Space</h6>
    Extraterrestrial area. Dungeons contain space creatures. Boss is The Creator.
   
  
  <h4>Rooms</h4>
    Individual instances of player encounters in a dungeon. Rooms have a dungeon theme, type, and doors.
    
   <h6>Room Types</h6>
    Start<br>
    End<br>
    Monster<br>
    Boss<br>
    Camp<br>
    Loot<br>
    Puzzle<br>
   
<h2>Attributes</h2>

  Players have two **primary** attributes: Health(HP) and Mana(MP) and four **secondary** attributes: Strength(STR), Dexterity(DEX), Intelligence(INT), and Luck(LUK).
  
  <h4>Health</h4>
    Affects how much damage a player can take before they die.
  
  <h4>Mana</h4>
    Affects how many attacks/abilities a player can attempt.

  <h4>Strength</h4>
    Affects physical damage with weapons.
    Determines what gavels the player can equip.

  <h4>Dexterity</h4>
    Affects objects created with brushes and player accuracy.
    Determines what brushes the player can equip.

  <h4>Intelligence</h4>
    Affects damage with psychic abilities.
    Determines what stones the player can equip.

  <h4>Luck</h4>
    Affects roll of dice.
    Determines what dice the player can equip.
    Has an effect on loot, player dodge/block chance, and other events.

<h2>Classes</h2>

  Players can develop four character classes(Judge, Artist, Psychic, Gambler).
  Each class has unique moves and items and relies on specific secondary attributes.

  <h4>Judge</h4>
    Difficulty: ?<br>
    Melee class that relies mainly on strength and uses a gavel. Has special ability JUDGEMENT.
    
  <h4>Artist</h4>
    Difficulty: ?<br>
    Summoner class that relies mainly on dexterity and uses a brush. Objects that it draws are summoned.
    
  <h4>Psychic</h4>
    Difficulty: ?<br>
    Spiritual class that relies mainly on intelligence and uses rocks/crystals. Has psychic abilities(telekinesis, telepathy, more).

  <h4>Gambler</h4>
    Difficulty: ?<br>
    Random fiesta class that relies on luck and uses enchanted dice. Spirit guardian/follower acts on your dice roll.


<h2>Items</h2>

  Players can equip different items pertaining to a certain class which affect the player's attacks and defences. Players can have one offensive item equipped at a time. Items have class, attribute, and player level requirements.
  
  <h4>Gavel</h4>
    Used by Judge class. Has strength requirement.
    
  <h4>Brush</h4>
    Used by Artist class. Has dexterity requirement.
    
  <h4>Stones</h4>
    Used by Psychic class. Has intelligence requirement.
    
  <h4>Dice</h4>
    Used by Gambler class. Has luck requirement. Can be offensive or defensive.
