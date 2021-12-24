//package lab6;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;



/**	Selects an image from a JList and previews it as a thumbnail.
 * 	This version will run correctly from a jar file.
 * 	Images should be placed in a subdirectory named "images" (note that
 * 	this is case sensitive when run from a jar file.
 * 	The subdirectory must be located immediately below the location of
 * 	the "parent" class.
 *
 * 	This code is modified from "ImagePreview.java" provided by Sun in the
 * 	Java 1.4 FileChooserDemo2.java example found in the tutorials.
 */


public class ImagePreview extends JComponent implements ListSelectionListener
{
	private	Class		parent;			// the class using ImagePreview
	private	ImageIcon	thumbnail = null;	// the thumb nailimage
	private	String		imageName = null;	// the name of the file containing the image




	/**	Constructs and ImagePreview object.
	 * 	@param list the initialized JList containing the list of image file names.
	 * 	@param parent the object instantiating and using the ImagePreview (actually,
	 * 	the Class object describing the user).
	 */

	public ImagePreview(JList list, Class parent)
	{
		this.parent = parent;
		setPreferredSize(new Dimension(100, 50));
		list.addListSelectionListener(this);		// make the ImavePreview object listen to the JList
	}




	/**	Loads the image as an icon and makes it into a thumbnail.
	 */

	public void loadImage()
	{
		if (imageName == null)
			return;

		ImageIcon tmpIcon = new ImageIcon(parent.getResource("images/" + imageName));
		if (tmpIcon != null)
		{
			if (tmpIcon.getIconWidth() > 90)
				thumbnail = new ImageIcon(tmpIcon.getImage().getScaledInstance(90, -1, Image.SCALE_DEFAULT));
			else
				thumbnail = tmpIcon;
		}
	}





	/**	The ListSelectionListener event handler.
	 * 	Determines which image name was selected from the list and load the image.
	 */

	public void valueChanged(ListSelectionEvent event)
	{
		imageName = (String)((JList)event.getSource()).getSelectedValue();

		loadImage();

		if (thumbnail != null)
			repaint();
	}




	/**	Paints the thumbnail image on the ImagePrevew.
	 */

	public void paintComponent(Graphics g)
	{
		if (thumbnail == null)
			loadImage();

		if (thumbnail != null)
		{
			int x = getWidth() / 2 - thumbnail.getIconWidth() / 2;
			int y = getHeight() / 2 - thumbnail.getIconHeight() / 2;

			if (y < 0)
				y = 0;

			if (x < 5)
				x = 5;

			thumbnail.paintIcon(this, g, x, y);
		}
	}
}

