module Api
  class PlaylistsController < ApplicationController
    def index
      render :json => Playlist.all
    end

    def show

    end
  end
end
