int topPlayers(Player[] team, double target){
   int count = 0;
   
   for (Player p : team){
      if (p.getAverage() > target)
         count++;
   }      
   return count;
}
//int topPlayers(Player[] team, double target) {
 //   int count = 0;

  //  for (int i = 0; i < team.length; i++) {
  //      if (team[i].getAverage() > target) {
   //         count++;
  //      }
  //  }

 //   return count;
//}