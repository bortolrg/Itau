{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red184\green93\blue213;\red42\green45\blue49;\red201\green201\blue201;
\red223\green180\blue104;\red81\green156\blue233;\red254\green213\blue177;\red197\green136\blue83;\red136\green185\blue102;
\red203\green203\blue203;}
{\*\expandedcolortbl;;\cssrgb\c77647\c47059\c86667;\cssrgb\c21961\c23137\c25098;\cssrgb\c82745\c82745\c82745;
\cssrgb\c90196\c75294\c48235;\cssrgb\c38039\c68235\c93333;\cssrgb\c100000\c86667\c74510;\cssrgb\c81961\c60392\c40000;\cssrgb\c59608\c76471\c47451;
\cssrgb\c83529\c83529\c83529;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  \cf5 \strokec5 Main\cf4 \strokec4  \{\
\
  \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 void\cf4 \strokec4  \cf6 \strokec6 main\cf4 \strokec4 (String[] args) \{\
\
    \cf7 \strokec7 // year to be checked\cf4 \strokec4 \
    \cf2 \strokec2 int\cf4 \strokec4  year = \cf8 \strokec8 1900\cf4 \strokec4 ;\
    \cf2 \strokec2 boolean\cf4 \strokec4  leap = \cf2 \strokec2 false\cf4 \strokec4 ;\
\
    \cf7 \strokec7 // if the year is divided by 4\cf4 \strokec4 \
    \cf2 \strokec2 if\cf4 \strokec4  (year % \cf8 \strokec8 4\cf4 \strokec4  == \cf8 \strokec8 0\cf4 \strokec4 ) \{\
\
      \cf7 \strokec7 // if the year is century\cf4 \strokec4 \
      \cf2 \strokec2 if\cf4 \strokec4  (year % \cf8 \strokec8 100\cf4 \strokec4  == \cf8 \strokec8 0\cf4 \strokec4 ) \{\
\
        \cf7 \strokec7 // if year is divided by 400\cf4 \strokec4 \
        \cf7 \strokec7 // then it is a leap year\cf4 \strokec4 \
        \cf2 \strokec2 if\cf4 \strokec4  (year % \cf8 \strokec8 400\cf4 \strokec4  == \cf8 \strokec8 0\cf4 \strokec4 )\
          leap = \cf2 \strokec2 true\cf4 \strokec4 ;\
        \cf2 \strokec2 else\cf4 \strokec4 \
          leap = \cf2 \strokec2 false\cf4 \strokec4 ;\
      \}\
      \
      \cf7 \strokec7 // if the year is not century\cf4 \strokec4 \
      \cf2 \strokec2 else\cf4 \strokec4 \
        leap = \cf2 \strokec2 true\cf4 \strokec4 ;\
    \}\
    \
    \cf2 \strokec2 else\cf4 \strokec4 \
      leap = \cf2 \strokec2 false\cf4 \strokec4 ;\
\
    \cf2 \strokec2 if\cf4 \strokec4  (leap)\
      System.out.println(year + \cf9 \strokec9 " is a leap year."\cf4 \strokec4 );\
    \cf2 \strokec2 else\cf4 \strokec4 \
      System.out.println(year + \cf9 \strokec9 " is not a leap year."\cf4 \strokec4 );\
  \}\
\}\cf10 \strokec10 \
}