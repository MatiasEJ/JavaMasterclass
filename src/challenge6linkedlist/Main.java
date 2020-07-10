package challenge6linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that implements a playlists for songs Create a Song Class
		 * having Title and Duration The program will have an Album Class containing a
		 * list of Songs The albums will be stored in an ArrayList Songs from different
		 * albums can be added to the playList and will appear in the list in the order
		 * they are added. Once the songs have been added to the playlst, create a menu
		 * of options to: quit, skip forward to the next song, backwars, replay, list
		 * songs, song must exist in album before it can be added Hint to replay a song
		 * consider what happened when we went back and forth from a city before started
		 * tracking the diretion extra: provide option to remove song from the playlist
		 */

		Album album = new Album("Stormbringer", "deepPurple");
		album.addSong("track1", 4);
		album.addSong("track2", 3);
		album.addSong("track3", 2.11);
		album.addSong("track4", 1.1);
		album.addSong("track5", 4.2);
		albums.add(album);

		album = new Album("album ac/dc", "ac/dc");
		album.addSong("trackacdc", 4);
		album.addSong("trackacdc1", 4.5);
		album.addSong("trackacdc2", 4.8);
		album.addSong("trackacdc3", 4.9);

		albums.add(album);

		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlaylist("track1", playList);
		albums.get(0).addToPlaylist("track2", playList);
		albums.get(0).addToPlaylist("watwat", playList); // No existe

		albums.get(0).addToPlaylist(4, playList);

		albums.get(1).addToPlaylist(1, playList);
		albums.get(1).addToPlaylist(2, playList);

		play(playList);

	}

	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> listIterator = playList.listIterator();
		if (playList.size() == 0) {
			System.out.printf("no songs");
			return;
		} else {
			printMenu();
			System.out.println("now playing" + listIterator.next().toString());
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.printf("playlist complete");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.printf("Now playing: " + listIterator.next().toString());
				} else {
					System.out.printf("End of playlist");
					forward = false;
				}
				break;
			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.printf("Now playing: " + listIterator.previous().toString());
				} else {
					System.out.printf("First item of playlist");
					forward = true;
				}
				break;

			case 3:
				// printList(playList);
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.printf("Now playing: " + listIterator.previous().toString());

					}
					forward = false;
				} else {
					if (listIterator.hasNext()) {
						System.out.printf("Now playing: " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.printf("First item of playlist");
						forward = true;
					}
				}
				break;
			case 4:
				printList(playList);
			case 5:
				printMenu();
			}
		}

	}

	private static void printMenu() {
		System.out.printf("OPTIONS \n ");
		System.out.printf("0 - quit \n ");
		System.out.printf("1 - next \n ");
		System.out.printf("2 - previous\n ");
		System.out.printf("3 - replay \n ");
		System.out.printf("4 - PrintList \n ");
		System.out.printf("5 - PrintMenu \n ");

	}

	private static void printList(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.printf("-------------------------\n");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.printf("-------------------------\n");
	}

}
