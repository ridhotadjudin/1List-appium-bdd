#Author: ridhotadjudin@gmail.com

@tag
Feature: OneList
	
	@tag1
  Scenario Outline: Menambahkan List Baru
    Given User berada pada Menu Utama
    When User menekan tombol Tambah List
    And User memasukkan nama list <listName>
    And User menekan tombol Save
    Then Nama List Baru tampil di Menu Utama <listName>
    
  Examples:
  |listName			|
  |Jadwal Harian|
#  |0123					|
#  |!@#$					|
	
	@tag2
	Scenario Outline: Menambahkan Isi List Baru
		Given User berada pada Menu Utama
    When User menekan tombol Tambah Isi List
    And User memasukkan isi list <isiName>
    And User menekan tombol Save Isi
    Then Isi List Baru tampil di Menu Utama <listName>
    
  Examples:
  |isiList|
  |Makan	|
  |Minum	|
  |Mandi	|
  |Belajar|
	
	@tag3
	Scenario Outline: Menambahkan List Baru Tapi Dibatalkan
    Given User berada pada Menu Utama
    When User menekan tombol Tambah List
    And User memasukkan nama list2 "Jadwal Harian"
    Then User menekan tombol Cancel
 
 @tag4
	Scenario Outline: Menambahkan List Baru Kosong
    Given User berada pada Menu Utama
    When User menekan tombol Tambah List
    And User memasukkan nama list2 ""
    Then User menekan tombol Save Kosong