### LEARN GUI FIRTS TO UNDERSTAND AND EDIT THIS FILE

## links that I will youse (a lot of it is in polish sory)
https://javastart.pl/baza-wiedzy/grafika_awt_swing/pierwszy-program-okienkowy
https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/javax/swing/package-summary.html
https://pl.khanacademy.org/computing/computer-programming/programming/good-practices/a/planning-a-programming-project
## What I want?

 ` I want to create my own wersion of break down, and yes it's gonna be the basic version. I am doing it for my self as a project to play with gui (AWT, SWT) `

## What I am planning to youse in this program?

- Intellij
- Java language 
- hand made grafic
- AWT, SWT

## Scenes

1. Menu
  - Play
    1. Game will start with 3 lifes and game score
      - If I winn
         1. You win!
         2. Next lvl
      - If I lose
         1. You Lose potato!
         2. Back to menu.
  - Help
    1. How to play
  - About me and my ego
    1. Simple information about me 🕷️:
  - Options
    1. Maby someone want to change thier moves key's =-= <!--optional-->

## what functions do I need?

1. Game
  - gui
  - peace of **wood** to move `left-right`
  - ball that is moving in perfect angle after touching **wood** or walls
  - bricks
  - colision
  - walls for ball
  - the flor is lava
  - score afrer destoing brick
  - none bricks > next lvl/you win
  - moving ball
  - *arena*

## To do in order

1. Start basic program in Intellij
2. Create objects
   - Ball{.move()}
   - Plank{.move()}
   - Brick{.didItHitMe()}
   - Wall[ABSTRACT]{.didSomeoneTouchedMe()} <!--Do I need it? I need to learn gui, that will be my first step-->
   - lava_Flor{Wall}


## My nemesis Collision that I am doing for my first time in life

https://www.youtube.com/watch?v=z7xMIRzIDpU - for help ^^
https://www.youtube.com/watch?v=oOEnWQZIePs - next help

Starting thinking about collision...

1. I need to get class that will be moveing my ball ^^
2. before my ball will move my game checking how far my ball is from every brick.
3. ## the borders that I need to thing about it (position - I think it will be the center of label (I need to check it))
4. when my ball sprite is from brick far as 0px the brick will disapear
5. ### how do I know what brick? - table of brick and jumping on one another thats why I need table of bricks
6. When the brick desapear one point is added (creating new label and deleting old. or changeing label)
7. when my ball is under the height of plank ball is moved to the center and the life label is changeing from 3.png to 2.png
  

  

