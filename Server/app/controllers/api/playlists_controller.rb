module Api
  class PlaylistsController < ApplicationController
    def index
      render :json => Playlist.limit(100).all.to_json(include: :songs)
    end

    def show

    end
  end
end
