rem Copy the existing file structure to the working directory of the mod.
del "..\Item_value_mod\item_value_mod\" /s /q
rmdir "..\Item_value_mod\item_value_mod"
mkdir "..\Item_value_mod\item_value_mod"
cd ..
cd item_value_mod_creator
xcopy ".\Stonehearth Mod JSON Generator\files\out\*" "..\item_value_mod\" /s

rem Convert the file structure to a .smod file.
7z a -tzip item_value_mod.zip ".\Stonehearth Mod JSON Generator\files\out\item_value_mod\*"
del item_value_mod.smod
ren item_value_mod.zip item_value_mod.smod

rem Copy that .smod file to the working directory of the mod.
copy item_value_mod.smod "..\Item_value_mod\"