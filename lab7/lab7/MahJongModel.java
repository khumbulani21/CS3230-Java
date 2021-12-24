//package lab6;

import javax.swing.JPanel;

public class MahJongModel extends Tile{

	private MahJongBoard board;
	private Tile[][][] tilesX ;
	private Tile[][] specialTiles;
	private Tile topTile;
	
 

	public MahJongModel(MahJongBoard board)
	{
		this( board,0  );
	}
	public MahJongModel(MahJongBoard board,long shuffleNumber)
	{
		
	
		this.board = board;
		 
		setOpaque(false);
		TileDeck deck= new TileDeck();
		
		  if(shuffleNumber==0) { 
			  deck.shuffle();
		  
		  
		  } else { deck.shuffle(shuffleNumber); }
		 
	
	 
		 
		specialTiles= new Tile[1][5];
		specialTiles[0][0]=deck.deal();
		specialTiles[0][1]=deck.deal();
		specialTiles[0][2]=deck.deal();
		specialTiles[0][3]=deck.deal();
	 
		Tile[][] layer0=new Tile[8][];
		layer0[0]=new Tile[12];
		layer0[1]=new Tile[8];
		layer0[2]=new Tile[10];
		layer0[3]=new Tile[12];
		layer0[4]=new Tile[12];
		layer0[5]=new Tile[10];
		layer0[6]=new Tile[8];
		layer0[7]=new Tile[12];
		
		Tile[][][] tiles = {new Tile[8][12],
				 new Tile[8][12],
				 new Tile[8][12],
				 new Tile[8][12]	};
		setTilesX(tiles);
	 
	  //set null for y also
	  //add tiles to the model
	  for(int layer=0;layer<tiles.length;layer++)
	  {
		  for(int row=0;row<tiles[layer].length;row++)
		  {
	 
			  for(int col=0;col<tiles[layer][row].length;col++)
			  {
				
				  if(layer==0&&(row==1||row==6)&&(col==0||col==1||col==10||col==11))
				  {
					 
					  tiles[layer][row][col]=null;
					  
				  }
				  else if(layer==0&&(row==2||row==5)&&(col==0||col==11))
				  {
					  tiles[layer][row][col]=null;
				  }
				  else if(layer==1&&(col==0||col==1||col==2||col==9||col==10||col==11))
				  {
					
					  tiles[layer][row][col]=null;
					  
				  }
				  else if(layer==2&&(col==0||col==1||col==2||col==3||col==8||col==9||col==10||col==11))
				  {
					 
					  tiles[layer][row][col]=null;
					  
				  }
				  else if(layer==3&&(col==0||col==1||col==2||col==3||col==4||col==7||col==8||col==9||col==10||col==11))
				  {
					  
					  tiles[layer][row][col]=null;
					  
				  } else if(layer==1&&(row==0 ||row==7))
				  {
					  
					  tiles[layer][row][col]=null;
					  
				  }
				  else if(layer==2&&(row==0 ||row==1||row==6||row==7))
				  {
					 
					  tiles[layer][row][col]=null;
					  
				  }
				  else if(layer==3&&(row==0 ||row==1||row==2||row==5||row==6||row==7))
				  {
					 
					  tiles[layer][row][col]=null;
					  
				  }
				  
				  else
				  {

					  Tile t=deck.deal();
					t.setLayer(layer);
					 t.setColumn(col);
					 t.setRow(row);
					  tiles[layer][row][col]=t;
				  }
				  
				   
			 
			  }
		  } 
	  }

		
	}

	public Tile[][][] getTilesX() {
		return tilesX;
	}

	public void setTilesX(Tile[][][] tilesX) {
		this.tilesX = tilesX;
	}
	
	
	  
	  
	
	  
	  public Tile[] neighbors(Tile tile,int row, int col, int layer) { return null;
	  
	  } 
	  public static void main(String args[]) { //
		MahJongBoard mb= new MahJongBoard(null);
		  MahJongModel mo=    new  MahJongModel(mb); 
		  }
	 
	  
	
	 Tile getTile( int layer,int row, int col)
	 {
		 if(tilesX==null||layer==4||layer<0||row<0||row>11)
		 {
			 return null;
		 }
		
		return tilesX[layer][row][col];
		 
	 }
	 Tile getSpecialTile(int col)
	 {
		 
			 return specialTiles[0][col];
		 
		 
	 }
	 
	 Tile getNeighbor(Tile t,char flag)
	 {
					 //check if neighbor is on the board
			int col=t.getColumn();
			int lay=t.getLayer();
			int row=t.getRow();
					
			switch(flag)
			{
			case 'T':lay=lay+1;
				break;
			case 'B':if(lay==0) {
				return null;
			}
			lay=lay-1;
				break;
			case 'R':if(col==11) {
				return null;
			}
				col=col+1;
				break;
			case 'L':if(col==0)
				{
				return null;
				}
			col=col-1;
				break;
				default :return null;
			}
			if(getTile(lay, row, col)!=null)
			{
				if(getTile(lay, row, col).isOnBoard())
			
					 return getTile(lay, row, col);
			}
			
			return null;
		 
		 
	 }
	 //A tile is open if it does not have a tile on top of it and if it does not have a neighboring tile on at least one of its left or right sides. 
	 public boolean isTileOpen(Tile t)
	 {
		 Tile rightNeighbor=getNeighbor(t,'R');
		 Tile leftNeighbor=getNeighbor(t,'L');
		 Tile topNeighbor=getNeighbor(t,'T');
		if(t==null)
			return false;
		if(t==specialTiles[0][3])
		{
			return true;
		}
		//check left most tile
		else if(t==specialTiles[0][1])
		{
			if(tilesX[0][3][11].isOnBoard()||tilesX[0][4][11].isOnBoard())
			{
				leftNeighbor=tilesX[0][3][11];
				rightNeighbor=specialTiles[0][2];
				topNeighbor=null;
			}
		}
		 if (topNeighbor==null && (rightNeighbor==null || leftNeighbor==null))
				return true;
	
		
		return false;
		
	 }
	
	 
}
