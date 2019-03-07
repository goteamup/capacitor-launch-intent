declare global {
  interface PluginRegistry {
    LaunchIntent?: LaunchIntentPlugin;
  }
}

export interface LaunchIntentPlugin {
  getLaunchIntentExtras(): Promise<any>;
  getLatestIntentExtras(): Promise<any>;
}
