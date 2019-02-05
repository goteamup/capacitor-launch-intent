declare global {
  interface PluginRegistry {
    LaunchIntentPlugin?: LaunchIntentPluginPlugin;
  }
}

export interface LaunchIntentPluginPlugin {
  getLaunchIntentExtras(): Promise<any>;
}
