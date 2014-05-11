class CreateSongs < ActiveRecord::Migration
  def change
    create_table :songs do |t|
      t.column :song_name, :string
      t.column :song_lyric, :text
      t.column :description, :text
      t.column :ranking, :integer

      t.timestamps
    end
  end
end
