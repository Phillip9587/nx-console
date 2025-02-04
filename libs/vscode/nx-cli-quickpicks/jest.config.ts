/* eslint-disable */
export default {
  displayName: 'vscode-nx-cli-quickpicks',
  preset: '../../../jest.preset.js',
  transform: {
    '^.+\\.[tj]s$': ['ts-jest', { tsconfig: '<rootDir>/tsconfig.spec.json' }],
  },
  moduleFileExtensions: ['ts', 'js', 'html'],
  coverageDirectory: '../../../coverage/libs/vscode/nx-cli-quickpicks',
  passWithNoTests: true,
};
