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
#  |Jadwal Harian|
#  |0123					|
  |!@#$					|
	
	@tag2
	Scenario Outline: Menambahkan List Baru Tapi Dibatalkan
    Given User berada pada Menu Utama
    When User menekan tombol Tambah List
    And User memasukkan nama list2 "Jadwal Harian"
    Then User menekan tombol Cancel
 
 @tag3
	Scenario Outline: Menambahkan List Baru Kosong
    Given User berada pada Menu Utama
    When User menekan tombol Tambah List
    And User memasukkan nama list2 ""
    Then User menekan tombol Save Kosong